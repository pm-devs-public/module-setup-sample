#### File: ModuleIntegration/build.gradle

```
allprojects {
    repositories {
        google()
        jcenter()
        flatDir {
            dirs 'libs'
        }
    }
}
```

#### File: ModuleIntegration/settings.gradle

```
include ':foo'
project(':foo').projectDir = new File(rootProject.projectDir, '../ModuleFoo/foo')
```

#### File: ModuleIntegration/app/build.gradle

```
debugImplementation project(':foo')
releaseImplementation(name: 'foo-release', ext: 'aar')
```

#### File: ModuleFoo/foo/src/main/java/com/parkmobile/sample/module/foo/FooService.kt

```
object FooService {

    fun getBuildType(): String = "ModuleFoo: ${BuildConfig.BUILD_TYPE}"

    fun getMessage(): String = if (BuildConfig.DEBUG) "Hello World" else "Good Bye World"

}
```
