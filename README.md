# STEPS FOR THE TEST EXECUTION

The TestNG **has a default value of** `thread = 5` for parallel testing.
To override the thread values use `-DthreadPoolSize=3 -Ddataproviderthreadcount=3` in the below maven command

**1. git clone https://github.com/prashant-sugumaran/ApiTestFramework.git**

**2. cd ApiTestFramework**

**3. git pull**

**4. mvn clean test -Dgroups=ALL_SMOKE,ALL_REGRESSION -Dtestng.parallel=methods**

**Note:**

- To run specific test cases, use appropriate Test groups present in the 'TestGroups' class.
