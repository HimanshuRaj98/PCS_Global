JavaScript Form Validation :

This repository contains JavaScript validation functions for a registration form. The form requires specific validations for each input field to ensure the data provided by users meets certain criteria.

Validation Requirements
A. Desired User Name:
Should not exceed 20 characters.
Should only contain alphanumeric characters (a-z,A-Z,0-9).

B. Password:
Must be between 8 and 20 characters.
Must contain at least one uppercase letter (A-Z).
Must contain at least one lowercase letter (a-z).
Must contain at least one number (0-9).
Must contain at least one special character from the set (! @ # $ ^ & * ~).
Must not contain space characters.

C. Name:
Must be a string with letters from 'a' to 'z' and 'A' to 'Z'.
Can include space(s).

D. Postal Code:
Must be a 6-digit Indian postal index number.
Validated using regular expressions.

E. Area:
Should not contain any special characters.

F. Address:
Can include all characters, including special characters.

G. Contact Number:
Must be a 10-digit phone number.
Non-digits are removed from validation.

H. Email:
Must be a valid email address.
Follows the format: personal_info@domain.
Personal info can be up to 64 characters, domain can be up to 253 characters.

I. Upload Photo Validation:
Supported file formats: *.jpg, *.png, *.gif.
Photo size should not exceed 2MB.

J. Gender:
Mandatory field.
Options: Male / Female.

K. Age:
Mandatory field.

Usage:

Participants can create JavaScript functions for each input field's validation. These functions should check whether the user-submitted value meets the specified validation criteria. The focus remains on the input field until a valid value is provided.

When users provide valid values, they can proceed to supply values for the next available fields in the form.

Please note that while JavaScript validation enhances user experience, server-side validation is crucial for security and data integrity.
