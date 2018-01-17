# AAAppleMusic

AAAppleMusic allows you as Android developer to get all the Apple Music data from the catalog including: albums, artists, tracks, etc.
To know more about that API take a look at [the Apple Music API website](https://developer.apple.com/library/content/documentation/NetworkingInternetWeb/Conceptual/AppleMusicWebServicesReference/index.html).

## Example

Clone or download the repository and run the example project.

## Requirements

- minSdkVersion 19

## Installation

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Step 2. Add the dependency

```
dependencies {
	compile 'com.github.aaronat1:AAAppleMusic:1.0.0'
}
```

Step 3. Disable annotations (this library use lombok)

```
javaCompileOptions {
    annotationProcessorOptions {
        includeCompileClasspath false
    }
}
```

## How to use it

This API is configured as you should know how to generate developer and user tokens, for more info [visit the Apple Music API.](https://developer.apple.com/library/content/documentation/NetworkingInternetWeb/Conceptual/AppleMusicWebServicesReference/SetUpWebServices.html)

 You should create your own web server that receives parameters as `POST` request in the **body** in JSON format like:

 ```
 {
    "kid": "C234234AS",
    "tid": "AS234ASF2"
 }
 ```

 and should return the token in JSON format:
 ```
 {
    "token": "alf9dsahf92fjdsa.fdsaifjds89a4fh"
 }
 ```

 Example code:

```
AAApleMusic.get().setToken("Bearer XXXXXXXXX.........");

AAApleMusic.get().getArtist("us", "178834", new Callback<Artist>() {
    @Override
    public void onResponse(Call<Artist> call, Response<Artist> response) {
        if (response.isSuccessful()) {
            Log.e("OK: ", response.body().getArtist().getAttributes().getName());
        } else {
            Log.e("ERROR: ", response.message());
        }
    }

    @Override
    public void onFailure(Call<Artist> call, Throwable t) {
        Log.e("Error: ", "Getting artist error");
    }
});
```

## IOS Version

[ASAppleMusic](https://github.com/Alexsays/ASAppleMusic) - by Alex Silva

## License
Copyright 2018 Aaron Asencio Tavio

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

