One protocol, multiple implementations, single test suit.

https://clojurians.slack.com/archives/C050HE28Y/p1550089203008900

`lein test` output:

```
Testing test-protocol-testing.a-protocol-test 
                                              
Testing test-protocol-testing.impl1-test      
Running impl1-test                            
Running test-bar                              
ProtocolImpl1 bar                             
Running test-baz                              
ProtocolImpl1 baz                             
[DONE] Running impl1-test                     
                                              
Testing test-protocol-testing.impl2-test      
Running impl2-test                            
Running test-bar                              
ProtocolImpl2 bar                             
Running test-baz                              
ProtocolImpl2 baz                             
[DONE] Running impl2-test                     
                                              
Ran 4 tests containing 4 assertions.          
0 failures, 0 errors.                         
                                              
Passed all tests                              
```
