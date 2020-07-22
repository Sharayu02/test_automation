Feature: Post a blog
  As a customer
  I want to post informative blogs
  So that I can share what I'm doing and raise my profile

  Acceptance Criteria
  * Any logged in user can create a blog
  * Premium accounts can publish 5 free blogs
  * Blogs costs $0.50

  Scenario: Dr Bill posts his own blog
    Given I am logged in as Dr Bill
    And I have a premium account
    And I have published 4 blogs
    When I try to post to my blog
    Then I should see "Your artical was published"

  Scenario: Dr Bill hits max number of free blogs
    Given I am logged in as Dr Bill
    And I have a premium account
    And I have published 5 blogs
    When I try to post my blog
    Then I should see "Please pay $0.50 to publish this blog"

  Scenario: Dr Bill pays for a blog
    Given I am logged in as Dr Bill
    And I have a premium account
    And I have paid $0.50 for a blog
    When I try to post to my blog
    Then I should see "Your article was published"
    And My account was updated