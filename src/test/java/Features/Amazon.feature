Feature: User Can Add Items to Cart

  Scenario: First Scenario
    Given user navigate to Amazon Website then type SearchKeyword
    When Select the first Item
    And Add item to the cart
    Then Go to the cart and check that item is "Added to Cart" successfully



  Scenario: Second Scenario
    Given user navigate to HomePage and Open today's deals
    When from the left side filters select Headphones and grocery
  	And from the discount part choose 10% off or more
    Then go to the fourth page then select any item and add it to the cart and check "Added to Cart"

