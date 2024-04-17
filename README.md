# Uncle Wet's Get Moving!

<div align="left"> 
  <a href="https://github.com/1chooo/gym-route" style="margin-right: 10px;">
    <img src="https://img.shields.io/badge/1chooo-gym__route-informational" alt="project badge">
  </a>
  <a href="https://www.java.com" style="margin-right: 10px;">
    <img src="https://img.shields.io/badge/Java-%3E%3D8-blue" alt="Java badge">
  </a>
  <a href="https://openjfx.io">
    <img src="https://img.shields.io/badge/JavaFX-17-green" alt="JavaFX badge">
  </a>
  <div align="right">
  <samp>
  <a href="README_zh.md">中文說明</a>
  </samp>
  </div>
</div>

This is the project that making an workout app to check the workout equipments.

**TOC**

- [Uncle Wet's Get Moving!](#uncle-wets-get-moving)
    - [Group: 27](#group-27)
    - [Member](#member)
  - [Project Concept](#project-concept)
  - [Usage Guidelines](#usage-guidelines)
  - [Warning](#warning)
  - [Instructions](#instructions)
    - [1. Enter the Interface](#1-enter-the-interface)
    - [2. Read Usage Guidelines](#2-read-usage-guidelines)
    - [3. Home Page](#3-home-page)
    - [4. Schedule Planning](#4-schedule-planning)
    - [5. Schedule Preview](#5-schedule-preview)
    - [6. View Full Month Plan](#6-view-full-month-plan)
    - [License](#license)

### Group: 27
### Member

| Dept.  | Name            | Student Number |
| ------ | --------------- | -------------- |
| 大氣二 | Hugo ChunHo Lin | 109601003      |
| 大氣二 | 洪晨哲          | 109601002      |
| 大氣二 | 謝文喨          | 109601005      |

## Project Concept
With the recent fitness trend and our surplus energy, we decided to start exercising. However, we couldn't find a useful and free program for arranging fitness schedules, so we decided to create a program that provides exercise descriptions and schedule planning.

## Usage Guidelines
1. It is recommended for fitness beginners to seek guidance from a fitness instructor.
2. Avoid rapidly clicking buttons.
3. The fitness schedule should be planned for a month as a cycle (training for four weeks).
4. This program does not record any schedule information, ensuring user privacy.
5. If unfamiliar with certain exercises, consult a professional fitness instructor or search online for professional demonstrations.

## Warning
The listed fitness movements are for reference only. If you experience discomfort, stop training immediately and consult a doctor as soon as possible.

## Instructions
### 1. Enter the Interface
Click the "This" button in the image to enter the program, as Annie likes it.
However, if you suddenly feel muscular enough when arranging the schedule, you can click the "Too Tired to Move" button to exit the program.
(But remember to come back! 🤗)

* Interface Display:
![plot](image/READMEImage/LoginPage.png)

### 2. Read Usage Guidelines
When entering the program by clicking the "This" button, please read the usage guidelines first, and click the "Confirm and Enter Main Page" button below. You cannot enter without clicking.
* #### Not Checked:
![plot](image/READMEImage/RuleUnchecked.png)
* #### Checked:
![plot](image/READMEImage/RuleChecked.png)

### 3. Home Page
After entering the main page, you can click on different body parts to browse various muscle groups and exercises. You can then start arranging your schedule.
(Demonstrated using the "Chest" body part)

* #### Muscle Groups Display:
![plot](image/READMEImage/HomeChest.png)
* #### Equipment Display:
![plot](image/READMEImage/HomeChestGif.png)

### 4. Schedule Planning
Upon entering the schedule planning section, you can click on a body part to view the corresponding exercise equipment. You can plan for each day of the week, including the order, repetitions, and sets for each day.

* #### Friendly Reminder:
1. You can select up to eight equipment exercises per day.
2. Ensure that the input order is not repeated.
3. Confirm that exercises, days of the week, and order are selected.
4. To delete a scheduled item, click on the item in the input list and then select the "Delete Row" button.
5. If you are unfamiliar with an exercise, you can click the "Back to Home" button to return to the homepage and view the exercise.
6. If there are duplicate order numbers, they will not be retained in the final schedule. Click the "Delete Row" button to re-enter.

* #### Operation Demonstration:
1. Start by selecting a body part
  ![plot](image/READMEImage/Curriculum1.png)
2. Choose equipment
  ![plot](image/READMEImage/Curriculum2.png)
3. Enter complete parameters (aerobic and core exercises may not require repetitions or sets)
  ![plot](image/READMEImage/Curriculum3.png)

### 5. Schedule Preview
You can view the arranged schedule on this page and confirm it. If you need to make corrections, you can click the "Back to Schedule Planning" button to continue editing the training schedule.

* #### Preview:
![plot](image/READMEImage/Preview.png)

### 6. View Full Month Plan
On this page, you can extend the schedule for one week to the next month. Keep up the training!
It is recommended to take screenshots to retain the arranged schedule.
If you want to rearrange a new schedule, click the "Back to Schedule Planning" button to return to the homepage and continue planning.
However, before that, remember to delete the previous content. For parameter deletion, use the "Clear" button; for input list deletion, use the "Delete Row" button, and then you can continue planning.

* #### Calendar Display:
![plot](image/READMEImage/Calender.png)
 
* #### After clicking the "Back to Schedule Planning" button, return to the homepage:
![plot](image/READMEImage/BackHome.png)

### License
Released under [MIT](./LICENSE) by [@1chooo](https://github.com/1chooo).

This software can be modified and reused without restriction.
The original license must be included with any copies of this software.
If a significant portion of the source code is used, please provide a link back to this repository.