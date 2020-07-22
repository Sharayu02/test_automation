Feature: Post a blog
  As a customer
  I want to post informative blogs
  So that I can share what I'm doing and raise my profile


  Background:
    Given I am logged in as Dr Bill
    And I have a premium account


  Scenario Outline: Dr Bill posts his own blog
    And I have published "<number of blogs>"
    When I try to post to my blog
    Then I should see "<message>"

    Examples:
    |number of blogs|message                                |
    |4              |Your artical was published             |
    |5              |Please pay $0.50 to publish this blog  |

  @paidBlog
  Scenario: Dr Bill pays for a blog
    And I have paid $0.50 for a blog
    When I try to post to my blog
    Then I should see "Your article was published"
    And My account was updated