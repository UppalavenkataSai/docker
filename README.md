# docker

What is Docker & Why it Helps

Docker is a platform for creating, running, and managing containers.

A container is a lightweight, portable package that contains your application code, runtime, libraries, and dependencies.

Containers run isolated from the host system, ensuring your app works the same everywhere (dev, test, production).

Why Docker helps:

✅ Simplifies application deployment

✅ Ensures consistent environments

✅ Efficient resource usage compared to virtual machines

✅ Easy scaling and orchestration in cloud and DevOps pipelines

✅ Supports CI/CD automation

2️⃣ Dockerfile Keywords & Usage
Keyword	Usage / Purpose
=============================================================================


FROM	    = Sets the base image for your container


WORKDIR	  = Sets the working directory inside container


COPY	    = Copies files from host to container


ADD	      = Copies files or URLs; auto-extracts archives


RUN       = Executes a command during image build


CMD	      = Default command when container starts


ENTRYPOINT =	Main command that always runs on start


EXPOSE	  = Documents ports container listens on


ENV	     = Sets environment variables inside container


USER	 = Runs container as a specific user (non-root)


Tip: CMD can be overridden at runtime; ENTRYPOINT cannot.


3️⃣ Common Docker Commands & Usage


Command	Purpose


docker --version	Show Docker version


docker ps	List running containers


docker ps -a	List all containers


docker images	List local images


docker pull <image>	Download image from registry


docker build -t <name> .	Build Docker image from Dockerfile


docker run -it <image> bash	Start container interactively


docker run -d -p hostPort:containerPort <image>	Run container detached with port mapping


docker logs <id>	View container logs


docker exec -it <id> /bin/bash	Enter running container


docker stop <id>	Gracefully stop container


docker kill <id>	Force stop container


docker rm <id>	Remove stopped container


docker rmi <id>	Remove image


docker network ls	List Docker networks


docker image prune	Remove unused images


docker volume prune	Remove unused volumes

======================================================================================================
✅ Quick Example Workflow
# Build Docker image
docker build -t myapp .
# Run container interactively
docker run -it myapp bash
# Run container detached with port mapping
docker run -d -p 5000:5000 myapp
# Check logs
docker logs <container_id>
# Enter running container
docker exec -it <container_id> /bin/bash
