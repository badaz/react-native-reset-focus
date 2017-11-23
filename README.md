
# react-native-reset-focus

resets the focus to the decor view.

## Getting started

`$ npm install react-native-reset-focus --save`

### Mostly automatic installation

`$ react-native link react-native-reset-focus`

### Manual installation

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

## Usage
```javascript
import RNResetFocus from 'react-native-reset-focus';

RNResetFocus.resetFocus();
```
