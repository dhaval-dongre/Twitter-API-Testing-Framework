FROM selenium/node-chrome

COPY . .

USER root
RUN apt-get update && apt-get install maven openjdk-8-jdk dos2unix wget zip unzip -y

RUN dos2unix command.sh

ENTRYPOINT ["bash", "command.sh"]