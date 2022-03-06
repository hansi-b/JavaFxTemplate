# JavaFxTemplate
Convenience project layout template for [JavaFX](https://openjfx.io/) with [Gradle](https://gradle.org/). Makes use of the magnificent [Badass JLink Plugin](https://badass-jlink-plugin.beryx.org/) for bundle creation.

Contains a minimal example "hello world" application which opens a window with a button and logs to the console.

## Usage

To create an executable bundle, this should suffice:

`./gradlew jpackageImage`

An executable `appFx` should be created in `fxApp/build/jpackage/appFx/bin/`

## Limitations

- The main class cannot be run from within Eclipse (seems like [this bug](https://github.com/eclipse/buildship/issues/658))
