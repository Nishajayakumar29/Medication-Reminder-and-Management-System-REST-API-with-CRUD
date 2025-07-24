# Medication-Reminder-and-Management-System-REST-API-with-CRUD
(The term "REST API" describes the architecture (how endpoints are exposed), while CRUD describes the operations your endpoints perform (Create, Read, Update, Delete).)
* Core Concepts Used
- Spring Boot REST API – Exposing CRUD endpoints.
- Spring Data JPA (ORM) – To simplify database interactions.
- MySQL Database – Stores medication records.
- JSON Communication – For easy integration with Postman or frontend apps.
- HTTP Response Management – Custom messages (message + data) and proper status codes.


1. Purpose of the Project
- This project is designed to manage medications by storing details like name, dosage, frequency, and reminder time.
- It helps users track and manage medications by providing CRUD operations through REST endpoints.
- It serves as a backend API that could be integrated with a frontend or mobile app to send reminders or display medication schedules.
2. How It Works – Process & Workflow
* Adding Medications (Create)
- User (via Postman or a frontend) sends a POST /api/medications request with medication details in    JSON.
- The system stores the data in the MySQL database.
- Response: {"message": "Reminder time is set successfully!"}

* Fetching Medications (Read)

- Users can retrieve all medications using GET /api/medications or a specific one with GET /api/medications/{id}.
- If the medication ID doesn’t exist, a 404 Not Found is returned with "Medication not found".

* Updating Medication (Update)

- A PUT /api/medications/{id} request allows the user to update the existing medication's details.
- The response contains both a success message and the updated medication details.

* Deleting Medication (Delete)

- The user can delete a medication with DELETE /api/medications/{id}.

- If the medication exists, it’s deleted and the response is "Deleted successfully".

- If you try to fetch it after deletion, you get a 404 Not Found.

* Purpose & Use Cases
- Personal Use: Helps individuals track their daily medication schedule.
- Healthcare Applications: Could be used in apps for patients to receive reminders for medications.
- Integration Ready: Can serve as a backend for a mobile or web app where patients or doctors can store, view, and manage prescriptions.
