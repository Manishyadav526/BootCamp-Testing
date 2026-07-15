Feature: Change Password

Background:
  Given User is logged into Internet Banking

@ChangePassword
Scenario Outline: Verify Change Password
  Given User is on Change Password page
  When User enters Old Password "<OldPassword>"
  And User enters New Password "<NewPassword>"
  And User confirms New Password "<ConfirmPassword>"
  And User clicks Update Password
  Then Password should be updated successfully

Examples:
| OldPassword | NewPassword | ConfirmPassword |
| Bank@123 | Bank@456 | Bank@456 |
