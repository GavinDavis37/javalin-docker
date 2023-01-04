# About This Repo
This project is a demonstration of a CI/CD pipeline for packaging Javalin Applications as docker containers, pushing them to docker hub and automatically updating running containers.

# To run demo
Start Javalin web server container:
docker run -p 7070:7070 -d gd43/docker-javalin-test:latest

Start watchtower container:
./startWatchtower.sh

Go to localhost:7070 to view container output

Change Javalin server response message and push change to github.

Run jenkins pipeline (note webhooks are not set up in the repo so this step has to be performed manually).

Following a successful run of the pipeline, wait two minutes for watchtower to detect and apply update.

Refresh page and observe updated message.

Required Jenkins plugins:
* Maven integration
* docker-build-step
* github
+ any associated dependencies.
