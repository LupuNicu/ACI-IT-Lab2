FROM alpine:3.20

# Install bash (optional) and set working dir
RUN apk add --no-cache bash
WORKDIR /usr/src/app

# Copy entrypoint
COPY entrypoint.sh /entrypoint.sh

# Ensure script will run with sh by default
ENTRYPOINT ["/entrypoint.sh"]

