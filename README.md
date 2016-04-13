multisearch-weka-package
========================

Weka package for parameter optimization, similar to GridSearch.
Can be used for optimizing an arbitrary number of parameters, in contrast to
GridSearch which always requires you to optimize two parameters. However, it
does not offer automatic search space extensions like GridSearch.

Releases
--------

Click on one of the following links to download the corresponding Weka package:

* [2016.4.14](https://github.com/fracpete/multisearch-weka-package/releases/download/v2016.4.14/multisearch-2016.4.14.zip)
* [2016.1.30](https://github.com/fracpete/multisearch-weka-package/releases/download/v2016.1.30/multisearch-2016.1.30.zip)
* [2016.1.15](https://github.com/fracpete/multisearch-weka-package/releases/download/v2016.1.15/multisearch-2016.1.15.zip)
* [2016.1.14](https://github.com/fracpete/multisearch-weka-package/releases/download/v2016.1.14/multisearch-2016.1.14.zip)
* [2016.1.13](https://github.com/fracpete/multisearch-weka-package/releases/download/v2016.1.13/multisearch-2016.1.13.zip)
* [2015.10.15](https://github.com/fracpete/multisearch-weka-package/releases/download/v2015.10.15/multisearch-2015.10.15.zip)
* [2015.9.2](https://github.com/fracpete/multisearch-weka-package/releases/download/v2015.9.2/multisearch-2015.9.2.zip)
* [2014.12.10](https://github.com/fracpete/multisearch-weka-package/releases/download/v2014.12.10/multisearch-2014.12.10.zip)


How to use packages
-------------------

For more information on how to install the package, see:

http://weka.wikispaces.com/How+do+I+use+the+package+manager%3F


Maven
-----

Add the following dependency in your `pom.xml` to include the package:

```xml
    <dependency>
      <groupId>com.github.fracpete</groupId>
      <artifactId>multisearch-weka-package</artifactId>
      <version>2016.1.30</version>
      <type>jar</type>
      <exclusions>
        <exclusion>
          <groupId>nz.ac.waikato.cms.weka</groupId>
          <artifactId>weka-dev</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
```
