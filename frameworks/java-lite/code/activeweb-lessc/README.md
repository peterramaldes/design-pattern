ActiveWeb Bootstrap
===================

Provides a skeleton for a [ActiveWeb](http://javalite.io) application that includes [Bootstrap](http://getbootstrap.com/) UI and Lessc files instead of CSS.

This basic skeleton does not use a database, so there's nothing to configure.


### Usage

You must have maven available in order to build and run the ActiveWeb application. If it's not installed you can install on a Mac using Brew ```$ brew install maven```

The easiest way to install and run is to clone this repository, and then run maven to download, and start the server.
```
$ git clone git@github.com:javalite/activeweb-lessc.git
$ cd activeweb-lessc
$ mvn jetty:run
```

After the dependencies are downloaded, and the application is built the jetty server will be started. Once the server
is running you can hit it in your browser using this URL [http://localhost:8080/activeweb-lessc](http://localhost:8080/activeweb-lessc)

For the next step I suggest you checkout the [JavaLite](http://javalite.io) documentation and samples.
