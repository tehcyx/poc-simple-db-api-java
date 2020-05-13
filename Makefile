.PHONY: docker

VERSION:=$(if ${VERSION},${VERSION},$(shell cat VERSION))
GIT_COMMIT:=$(if ${GIT_COMMIT},${GIT_COMMIT},$(shell git rev-list -1 HEAD))
CMP_NAME=simple-db-api-java

docker: dockerjava

dockerjava:
	docker build -t ${CMP_NAME}:${VERSION} -f Dockerfile .
	docker tag ${CMP_NAME}:${VERSION} ${CMP_NAME}:${GIT_COMMIT}

tag: tagjava

tagjava: dockerjava
	docker tag ${CMP_NAME}:${VERSION} tehcyx/${CMP_NAME}:${VERSION}
	docker tag ${CMP_NAME}:${VERSION} tehcyx/${CMP_NAME}:${GIT_COMMIT}

push: pushjava

pushjava: tagjava
	docker push tehcyx/${CMP_NAME}:${VERSION}
	docker push tehcyx/${CMP_NAME}:${GIT_COMMIT}
