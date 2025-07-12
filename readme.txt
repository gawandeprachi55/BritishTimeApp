# 🕰️ British Time Conversion App

Converts `HH:MM` input into British English spoken form (e.g., `07:30 → half past seven`).  
Full-stack app built with **Spring Boot** (backend) + **React** (frontend).

---

## 🚀 Prerequisites

1. **Java JDK 17+**  
2. **Node.js** (includes `npm` / `npx`)

---

## 🛠️ Setup & Run

### 1. Clone the repo  
```bash
git clone <repo-url>
cd BritishTimeConversion
2. Start the backend
Open PowerShell or CMD in the project root (where pom.xml and mvnw.cmd reside):

powershell
cd C:\gitRepo\BritishTimeCnverstion
.\mvnw.cmd spring-boot:run
Your API is now running at

bash
http://localhost:8080/api/time/speak
3. Start the frontend
Open a new terminal (e.g., in IntelliJ or separate window), run:

bash
cd C:\gitRepo\BritishTimeCnverstion\frontend
npm install          # (only on first setup)
npm start
React app runs at http://localhost:3000, auto-forwarding API calls to the backend via proxy.


**Usage**
Via Browser/API:
GET http://localhost:8080/api/time/speak?input=12:00
Returns:

json

{ "spoken": "noon" }

Or try:

?input=12:50

?input=1:05

Via UI:
Open http://localhost:3000, enter time into the Time: input, click Speak, and get the spoken output.

