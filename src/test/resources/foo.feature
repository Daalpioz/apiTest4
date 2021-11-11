Feature: features of gherkin test
  Scenario Outline: client makes call to GET hi2
    When the client calls hi2
    Then the client receives status code of 200