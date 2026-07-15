Feature: Mini Statement

Background:
  Given User is logged into Internet Banking

@MiniStatement
Scenario: Verify Mini Statement
  When User clicks Mini Statement
  Then Last five transactions should be displayed
