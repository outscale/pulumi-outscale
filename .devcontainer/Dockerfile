FROM jetpackio/devbox:latest

# Installing your devbox project
WORKDIR /code
COPY devbox.json devbox.json
COPY devbox.lock devbox.lock

USER root
RUN chown -R "${DEVBOX_USER}:${DEVBOX_USER}" /code
USER "${DEVBOX_USER}"

RUN devbox run -- echo "Installed Packages."

RUN devbox shellenv --init-hook >> ~/.profile
