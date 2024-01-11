Pod::Spec.new do |spec|
    spec.name                     = 'shared'
    spec.version                  = '1.0'
    spec.homepage                 = 'http://example.com'
    spec.source                   = { :http => 'https://github.com/daugeldauge/wizardly/releases/download/0.0.1/shared.xcframework.zip'}
    spec.authors                  = ''
    spec.license                  = ''
    spec.summary                  = 'example'
    spec.vendored_frameworks      = 'shared.xcframework'
    spec.libraries                = 'c++'
    spec.ios.deployment_target = '14.1'
    spec.dependency 'FirebasePerformance'
end