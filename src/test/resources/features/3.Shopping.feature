Feature: Shopping

@tag1
	Scenario: User Search product
		When user go to shop web
    Then user enter button search
    And user search product one
    And user search product two
    
@tag2
	Scenario: Add Cart and Place Order
    When user go to shop web
    And user click product shirt
    And add to cart
		And user click tab checkout
  	And fill out the form
  	Then click button place order
    

