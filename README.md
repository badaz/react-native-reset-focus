
# react-native-reset-focus

## Getting started

`$ npm install react-native-reset-focus --save`

### Mostly automatic installation

`$ react-native link react-native-reset-focus`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-reset-focus` and add `RNResetFocus.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNResetFocus.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNResetFocusPackage;` to the imports at the top of the file
  - Add `new RNResetFocusPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-reset-focus'
  	project(':react-native-reset-focus').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-reset-focus/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-reset-focus')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNResetFocus.sln` in `node_modules/react-native-reset-focus/windows/RNResetFocus.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Reset.Focus.RNResetFocus;` to the usings at the top of the file
  - Add `new RNResetFocusPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNResetFocus from 'react-native-reset-focus';

// TODO: What to do with the module?
RNResetFocus;
```
  