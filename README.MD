# Spring Boot Applications for Kubernetes
Multi-Maven Spring Boot Project to demo test with Kubernetes and spotify dockerfile plugin!
## To Do:
    > Dockerfile/Spotify plugin setup
    > SQL/NoSQL connection (Spring Profiling?)
    > Bootstrap frontend
    > Kubernetes Setup
    > JUnit Classes
    > CI (Jenkins/Teamcity/Circle Ci)
    > Deploy Pom File.
## Docker Commands:
    Docker Network:
    docker network create springkub --subnet 172.23.0.0/16
    
    RestLayer:
    > docker run --name restlayer -p 8080:8080 -p 8090:8090 --network springkub -d cyrilenblu/springkub-restlayer:0.2
    
    WebLayer (env data.source.ip is the ip of restlayer in network [docker network inspect springkub]):
    > docker run --name weblayer -e data.source.ip=172.23.0.2 -p 8081:8081 --network springkub -d cyrilenblu/springkub-weblayer:0.2
    
