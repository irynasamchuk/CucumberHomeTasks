Feature: GoogleTranslate feature

#  Scenario: Looking up the translation of the 'apple'
#    Given the user is on the google translate page
#    And selected languages from 'английский' to 'украинский'
#    When the user looks up the translation of the word 'apple'
#    Then they should see the translation 'яблуко'

  Scenario: Check the number of characters entered
    Given the user is on the google translate page
    And selected languages from 'английский' to 'украинский'
    When the user looks up the translation of the word 'apple'
    Then number of characters must be '6'

#  Scenario: Looking up the definition of 'apple'
#    Given the user is on the google translate page
#    And selected languages from 'английский' to 'украинский'
#    When the user looks up the translation of the word 'apple'
#    Then they should see the definition 'the tree which bears apples.'