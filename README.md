\# Mini SAP UI5 HANA Material App



A small SAP-oriented learning and portfolio project built with Java Spring Boot and SAP UI5.



The project demonstrates a simple material stock overview with a Spring Boot backend and a SAP UI5 / Fiori-style frontend.



It was created to practice concepts that are relevant for Junior SAP / ABAP Developer roles, such as SAP UI5, JavaScript, OData-style interfaces, CDS Views, HANA SQL Script and Cross Application development.



\## Project Goal



The goal of this project is to build a small full-stack demo that connects a SAP UI5 frontend with a Java Spring Boot backend.



The business topic is a simple material stock overview.



The project focuses on:



\- Material master data

\- Current stock

\- Minimum stock

\- Low-stock status

\- SAP UI5 frontend

\- OData-style backend endpoints

\- HANA SQL Script learning examples

\- CDS View learning examples

\- Cross Application documentation



This project is a personal learning and portfolio project.



\## Important Note



This is not a productive SAP application.



The backend uses a local H2 database for simple development and testing.



The project includes HANA SQL Script and CDS View examples as learning documentation to show how similar ideas could be represented in SAP-related technologies.



\## Tech Stack



\### Backend



\- Java 17

\- Spring Boot

\- Spring Web

\- Spring Data JPA

\- Bean Validation

\- H2 Database

\- Maven



\### Frontend



\- SAP UI5

\- JavaScript

\- HTML

\- Fiori-style UI components

\- SAP UI5 Table

\- ObjectStatus for stock status



\### SAP Learning Topics



\- OData-style API design

\- CDS View examples

\- HANA SQL Script examples

\- Cross Application concept

\- Material stock overview

\- SAP UI5 / Fiori frontend concepts



\### Tools



\- Git

\- GitHub

\- VS Code

\- PowerShell

\- Browser

\- Python local HTTP server



\## Features



\### Backend Features



\- Material entity

\- Material repository

\- Material service

\- Material controller

\- OData-style REST endpoint

\- Low-stock endpoint

\- Search endpoint

\- Demo data loader

\- Local H2 database



\### Frontend Features



\- SAP UI5 / Fiori-style page

\- Material stock table

\- Data loaded from Spring Boot backend

\- Refresh button

\- Low-stock filter button

\- Stock status display

\- Simple beginner-friendly JavaScript code



\### Documentation Features



\- OData notes

\- CDS View examples

\- HANA SQL Script examples

\- Cross Application notes



\## Backend API Endpoints



\### Get All Materials



```text

GET /api/odata/materials

```



Example URL:



```text

http://localhost:8081/api/odata/materials

```



\### Search Materials



```text

GET /api/odata/materials/search?keyword=MAT

```



\### Get Low-Stock Materials



```text

GET /api/odata/materials/low-stock

```



\### Create Material



```text

POST /api/odata/materials

```



Example request:



```json

{

&#x20; "materialNumber": "MAT-1003",

&#x20; "name": "Keyboard Logitech",

&#x20; "unit": "STK",

&#x20; "currentStock": 4,

&#x20; "minimumStock": 2

}

```



\## Example Backend Response



```json

\[

&#x20; {

&#x20;   "materialNumber": "MAT-1001",

&#x20;   "name": "Laptop Lenovo ThinkPad",

&#x20;   "unit": "STK",

&#x20;   "currentStock": 3,

&#x20;   "minimumStock": 3,

&#x20;   "id": 1

&#x20; },

&#x20; {

&#x20;   "materialNumber": "MAT-1002",

&#x20;   "name": "Monitor Samsung",

&#x20;   "unit": "STK",

&#x20;   "currentStock": 8,

&#x20;   "minimumStock": 2,

&#x20;   "id": 2

&#x20; }

]

```



\## How to Run the Backend



Open a terminal in the backend project folder:



```powershell

cd backend\\demosap-hana-material-backend

```



Start Spring Boot:



```powershell

.\\mvnw spring-boot:run

```



The backend runs on:



```text

http://localhost:8081

```



Test the API in the browser:



```text

http://localhost:8081/api/odata/materials

```



\## H2 Database Console



The local H2 console is available at:



```text

http://localhost:8081/h2-console

```



Connection settings:



```text

JDBC URL: jdbc:h2:mem:saphanademo

User Name: sa

Password:

```



\## How to Run the SAP UI5 Frontend



Open a second terminal and go to the UI5 webapp folder:



```powershell

cd ui5-frontend\\webapp

```



Start a simple local HTTP server:



```powershell

python -m http.server 5600

```



Open the frontend in the browser:



```text

http://localhost:5600

```



The SAP UI5 frontend loads material data from:



```text

http://localhost:8081/api/odata/materials

```



The backend must be running at the same time.



\## Project Structure



```text

mini-sap-ui5-hana-material-app

│

├── backend

│   └── demosap-hana-material-backend

│       │

│       ├── src

│       │   └── main

│       │       ├── java

│       │       │   └── com

│       │       │       └── omar

│       │       │           └── saphana

│       │       │               │

│       │       │               ├── controller

│       │       │               │   └── MaterialController.java

│       │       │               │

│       │       │               ├── entity

│       │       │               │   └── Material.java

│       │       │               │

│       │       │               ├── repository

│       │       │               │   └── MaterialRepository.java

│       │       │               │

│       │       │               ├── service

│       │       │               │   └── MaterialService.java

│       │       │               │

│       │       │               ├── DataLoader.java

│       │       │               └── DemosapHanaMaterialBackendApplication.java

│       │       │

│       │       └── resources

│       │           └── application.properties

│       │

│       ├── pom.xml

│       ├── mvnw

│       └── mvnw.cmd

│

├── ui5-frontend

│   └── webapp

│       └── index.html

│

├── docs

│   ├── odata-notes.md

│   ├── cds-view-examples.md

│   ├── hana-sql-script-examples.sql

│   └── cross-application-notes.md

│

├── LICENSE.md

└── README.md

```



\## SAP / Job Advertisement Relevance



This project was created to cover practical learning topics from SAP-oriented job descriptions.



Covered topics:



\- SAP UI5

\- JavaScript

\- OData-style interfaces

\- CDS View learning examples

\- HANA SQL Script learning examples

\- SQL database concepts

\- Cross Application documentation

\- Backend API development

\- Frontend-backend integration

\- Material stock overview

\- Low-stock logic



\## Relation to OData



The backend endpoint uses an OData-style naming approach:



```text

/api/odata/materials

```



This is not a full SAP OData implementation.



It is a beginner-friendly REST API that demonstrates entity-based service thinking.



More details are documented in:



```text

docs/odata-notes.md

```



\## Relation to CDS Views



The project includes simplified CDS View examples for:



\- Material stock overview

\- Low-stock materials



Documentation file:



```text

docs/cds-view-examples.md

```



\## Relation to HANA SQL Script



The project includes HANA SQL Script learning examples for:



\- Material table idea

\- Select all materials

\- Low-stock query

\- Calculated stock status



Documentation file:



```text

docs/hana-sql-script-examples.sql

```



\## Relation to Cross Application Development



The project connects multiple layers:



```text

SAP UI5 Frontend

&#x20;   |

OData-style Backend API

&#x20;   |

Spring Boot Service Layer

&#x20;   |

Database Layer

```



Documentation file:



```text

docs/cross-application-notes.md

```



\## Beginner-Friendly Code Style



The project code is intentionally simple and beginner-friendly.



It uses:



\- Simple classes

\- Clear method names

\- Basic comments

\- No unnecessary complex patterns

\- Straightforward frontend logic

\- Easy-to-read backend structure



The goal is to show practical learning progress for Junior Developer roles.



\## License and Usage



Copyright (c) 2026 Omar Mohamad-Ali.



All rights reserved.



This project is a personal portfolio and learning project.



The source code, documentation and project structure may not be copied, modified, redistributed, published or used for commercial or non-commercial purposes without prior written permission from the author.



Viewing the repository for evaluation, review or recruitment purposes is allowed.



This project is not intended for production use.



\## Future Improvements



\- Real SAP OData implementation

\- SAP CAP demo project

\- Real SAP HANA Cloud connection

\- More SAP UI5 views

\- Material detail page

\- Create material form in UI5

\- Unit tests for backend service

\- Better error handling

\- Deployment notes

