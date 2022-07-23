ARG ACCOUNT
ARG REGION
ARG OLP_IMAGE
ARG OLP_TAG

# Stage and thin the application
FROM $ACCOUNT.dkr.ecr.$REGION.amazonaws.com/$OLP_IMAGE:$OLP_TAG as staging

COPY --chown=1001:0 target/elementary-particles-api.jar \
                    /staging/fat-elementary-particles-api.jar

RUN springBootUtility thin \
 --sourceAppPath=/staging/fat-elementary-particles-api.jar \
 --targetThinAppPath=/staging/thin-elementary-particles-api.jar \
 --targetLibCachePath=/staging/lib.index.cache

# Build the image
FROM $ACCOUNT.dkr.ecr.$REGION.amazonaws.com/$OLP_IMAGE:$OLP_TAG

RUN cp /opt/ol/wlp/templates/servers/springBoot2/server.xml /config/server.xml.template
RUN sed '/id=\"defaultHttpEndpoint\"/a \ host=\"*\"' /config/server.xml.template > /config/server.xml

COPY --chown=1001:0 --from=staging /staging/lib.index.cache /lib.index.cache
COPY --chown=1001:0 --from=staging /staging/thin-elementary-particles-api.jar \
                    /config/dropins/spring/thin-elementary-particles-api.jar

RUN configure.sh
