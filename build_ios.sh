#!/usr/bin/env sh

xcodebuild -workspace /Users/Artem.Daugel-Dauge/projects/wizardly/iosApp/iosApp.xcworkspace -scheme iosApp -configuration Debug OBJROOT=/Users/Artem.Daugel-Dauge/projects/wizardly/build/ios SYMROOT=/Users/Artem.Daugel-Dauge/projects/wizardly/build/ios -sdk iphonesimulator -arch arm64

