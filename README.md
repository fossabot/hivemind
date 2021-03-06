# Hivemind turns your Tensorflow project into an API
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fkyr7%2Fhivemind.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Fkyr7%2Fhivemind?ref=badge_shield)


Collects data, trains, serves and distributes your Tensorflow models via REST API.

## STATUS alpha; implementing swagger schema : https://app.swaggerhub.com/apis/kyr7/hivemind/0.0.1

## Running
1. tested on ubuntu 18. CPU training shoud also run on Windows and Mac OS. 
1. install docker https://www.docker.com/
    * install nvidia docker runtime https://github.com/NVIDIA/nvidia-docker
    * recommended to `docker pull` : 
       * tensorflow/serving:latest
       * tensorflow/tensorflow:latest-gpu-py3 `OR` tensorflow/tensorflow:latest-py3 if you set up CPU training
       * if you don't pull these images manually, they will have to be pulled before learning automatically, which is rather slow a.t.m.
1. docker client must be set up to work without `sudo` https://docs.docker.com/install/linux/linux-postinstall/
1. see examples folder for API referebce.
1. execute `./gradlew run` to start

## License

[Apache License 2.0](LICENSE)


[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fkyr7%2Fhivemind.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Fkyr7%2Fhivemind?ref=badge_large)