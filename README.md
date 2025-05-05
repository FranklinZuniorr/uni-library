# uni-library

# Web System - Cesumar University Library

This is a university project developed as part of the academic activity for the **Web Systems Development** course.

This repository contains the code for the web system developed to modernize the book management services of the **Cesumar University Library**. The university identified the need to replace the manual book control process, which was previously done through spreadsheets, with a more efficient, secure, and remotely accessible digital solution. A junior development team was hired to create a simple, functional system with a user-friendly interface that meets the following requirements:

## Objective
Develop a web system in Java, using **Servlets**, **JSP**, and **JSF**, applying object-oriented concepts and the **MVC (Model-View-Controller)** pattern to allow the registration, listing, and deletion of books in the library's internal catalog.

## Features
The web system should offer the following functionalities:

1. **Book registration**, with the following data:
   - Title
   - Author
   - Publication year
   - ISBN

2. **Listing of registered books**, displaying information clearly and organized.

3. **Deletion of books** from the list, which can be done by ISBN or ID.

## Technical Requirements
- Use of **Servlets** to handle requests and process the system logic.
- Use of **JSP** and/or **JSF** for building the user interface.
- Structuring the project based on the **MVC pattern**.
- Original code, developed from scratch, without the use of automatic visual builders or external frameworks beyond the scope of the activity.
- Handling common errors, such as empty fields or invalid ISBN entries.

## Delivery Checklist
- Book registration with **Title**, **Author**, **Year**, and **ISBN**.
- Listing of registered books.
- Deletion of books.
- Web interfaces developed with **JSP** and/or **JSF**.

  RUN: mvn jetty:run
- Handling of invalid inputs (e.g., empty fields, invalid ISBN).
- Organization of the project into packages: **model**, **controller**, **view**.
- Clear separation between business logic and presentation.
- Well-commented and easy-to-read code.
- Proper use of **Servlets** to control actions.
- Use of **JSF** in at least one of the interfaces.
