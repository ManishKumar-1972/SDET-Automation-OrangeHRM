Totally fair — let’s do this manually, step by step. Here's the full, polished `README.md` content you can **copy-paste** into your file:

---

### ✅ `README.md`

```markdown
# 🧪 SDET Automation Project - OrangeHRM Login Functionality

This is a real-world automation testing project built with **Java, Selenium WebDriver, Cucumber (BDD), and TestNG**, designed to validate the login functionality of [OrangeHRM](https://opensource-demo.orangehrmlive.com/).

It follows industry-standard best practices like **Page Object Model**, **cross-browser WebDriver setup**, and **Cucumber feature-driven testing**.

---

## 📂 Project Structure

```
SDET-Automation-OrangeHRM
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.orangehrm
│   │   │       ├── pages             # Page Object Classes (LoginPage.java)
│   │   │       ├── utils             # DriverFactory.java
│   │   │       └── Main.java         # (optional entrypoint)
│   └── test
│       ├── java
│       │   ├── runners               # TestNG runner (TestRunner.java)
│       │   └── stepdefinitions       # Cucumber StepDefs (LoginStepDefinitions.java)
│       └── resources
│           └── features              # Cucumber Feature File (Login.feature)
│
├── pom.xml                           # Maven dependencies
└── testng.xml                        # Optional TestNG config
```

---

## ✅ Features Covered

### 🟢 Valid Login
- Admin can log in using valid credentials.

### 🔴 Invalid Login
- Shows error message for incorrect credentials.

### ⚠️ Empty Fields
- Shows `Required` validation when username/password are blank.

---

## 🧰 Tech Stack

- **Java 17+**
- **Selenium WebDriver**
- **Cucumber (BDD)**
- **TestNG**
- **FirefoxDriver**
- **Maven**

---

## 🚀 How to Run

### 1. Clone the repo
```bash
git clone https://github.com/ManishKumar-1972/SDET-Automation-OrangeHRM.git
cd SDET-Automation-OrangeHRM
```

### 2. Run via Maven (from IntelliJ or terminal)
```bash
mvn test
```

Or run `TestRunner.java` via IntelliJ.

---

## 📸 Sample Test Scenarios

```gherkin
Scenario: Successful login with valid credentials
  Given I launch the OrangeHRM login page
  When I enter valid username and password
  Then I should be redirected to the dashboard

Scenario: Login with invalid credentials
  Given I launch the OrangeHRM login page
  When I enter username "invalid" and password "invalid123"
  Then I should see an error message

Scenario: Login with empty credentials
  Given I launch the OrangeHRM login page
  When I submit empty login form
  Then I should see required field validation errors
```

---

## 📄 Reporting
- **HTML Report** auto-generated in `/target/cucumber-reports.html` after each run.

---

## 🧠 Author

**Manish Kumar**  
[SDET | Java | Selenium | Cucumber | BDD | TestNG]  
GitHub: [ManishKumar-1972](https://github.com/ManishKumar-1972)

---

## 🙌 Contributions & Feedback

Feel free to fork, star ⭐, or raise issues!
```
