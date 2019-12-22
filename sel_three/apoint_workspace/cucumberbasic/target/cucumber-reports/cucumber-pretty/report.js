$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features_TagEx/FeatureDataTableFileEx1.feature");
formatter.feature({
  "line": 1,
  "name": "Data table",
  "description": "\r\nVerify that the new user registration is unsuccessful after passing incorrect inputs.",
  "id": "data-table",
  "keyword": "Feature"
});
formatter.before({
  "duration": 257400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "data-table;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter invalid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values",
        "Value2"
      ],
      "line": 11
    },
    {
      "cells": [
        "First Name",
        "Tom",
        "info 1"
      ],
      "line": 12
    },
    {
      "cells": [
        "Last Name",
        "Kenny",
        "unfo2"
      ],
      "line": 13
    },
    {
      "cells": [
        "Email Address",
        "someone@someone.com",
        "unfo3"
      ],
      "line": 14
    },
    {
      "cells": [
        "Re-enter Email Address",
        "someone@someone.com",
        "unfo4"
      ],
      "line": 15
    },
    {
      "cells": [
        "Password",
        "Password1",
        "unfo5"
      ],
      "line": 16
    },
    {
      "cells": [
        "Birthdate",
        "01",
        "unfo6"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FeatureDataTableFileEx1.goToFacebook()"
});
formatter.result({
  "duration": 58844800,
  "status": "passed"
});
formatter.match({
  "location": "FeatureDataTableFileEx1.enterData(DataTable)"
});
formatter.result({
  "duration": 728700,
  "status": "passed"
});
formatter.after({
  "duration": 33200,
  "status": "passed"
});
formatter.uri("src/test/resources/Features_TagEx/FeatureDataTableFileEx2.feature");
formatter.feature({
  "line": 1,
  "name": "Data Table Ex",
  "description": "Verify that the new user registration is unsuccessful after passing incorrect inputs.",
  "id": "data-table-ex",
  "keyword": "Feature"
});
formatter.before({
  "duration": 29200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "data-table-ex;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter invalid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values",
        "Value2"
      ],
      "line": 10
    },
    {
      "cells": [
        "First Name",
        "Tom",
        "Ex2"
      ],
      "line": 11
    },
    {
      "cells": [
        "Last Name",
        "Kenny",
        "Ex2"
      ],
      "line": 12
    },
    {
      "cells": [
        "Email Address",
        "someone@someone.com",
        "Ex2"
      ],
      "line": 13
    },
    {
      "cells": [
        "Re-enter Email Address",
        "someone@someone.com",
        "Ex2"
      ],
      "line": 14
    },
    {
      "cells": [
        "Password",
        "Password1",
        "Ex2"
      ],
      "line": 15
    },
    {
      "cells": [
        "Birthdate",
        "01",
        "Ex2"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FeatureDataTableFileEx1.goToFacebook()"
});
formatter.result({
  "duration": 37300,
  "status": "passed"
});
formatter.match({
  "location": "FeatureDataTableFileEx1.enterData(DataTable)"
});
formatter.result({
  "duration": 112700,
  "status": "passed"
});
formatter.after({
  "duration": 39600,
  "status": "passed"
});
});