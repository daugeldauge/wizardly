#import <Foundation/Foundation.h>
#import "baz.h"

NSString* foo(void);

@protocol FooProtocol <BazProtocol>
- (NSString *) foo;
@end
