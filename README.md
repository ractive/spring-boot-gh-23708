This sample repository shows an issue with spring 2.4 and mockito when
trying to use a spring-data repository as a `@SpyBean`. A `NotAMockException`
is thrown by mockito when the spy bean is used in a call to `Mockito.verify`.

The test `MockfailureTest` fails with:

```
org.mockito.exceptions.misusing.NotAMockException: 
Argument passed to verify() is of type $Proxy74 and is not a mock!
Make sure you place the parenthesis correctly!
See the examples of correct verifications:
    verify(mock).someMethod();
    verify(mock, times(10)).someMethod();
    verify(mock, atLeastOnce()).someMethod();

	at mockfailure.MockfailureTest.test(MockfailureTest.java:18)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
.....

```

The issue already was reported as https://github.com/spring-projects/spring-boot/issues/23708 but closed as a duplicate.
This is an updated version of [this sample project](https://github.com/spring-projects/spring-boot/issues/23708#issuecomment-725315520) to show that the issue still exists in spring 2.4.

