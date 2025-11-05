
# 🎱 Billiard Problem (Bài toán Bi-a)

A Java billiard simulation game developed using **Apache NetBeans** and **Java Swing**.
Players can create billiard balls, select maps, and simulate their motion and collisions in a 2D environment.

---

## 🧩 Overview

This project demonstrates:

* Object motion using 2D vectors
* Collision detection between balls and obstacles
* Custom map generation
* GUI programming with Java Swing

---

## 🕹️ How to Play

1. **Start the game**

   * Click the **“Bắt đầu”** (Start) button to begin the simulation.

2. **Set number of balls**

   * Enter the desired number of balls (between **1–200**) in the box labeled *“Số bóng (1–200)”*.

3. **Generate balls**

   * Click **“Tạo bóng”** (Create Balls) to place the balls on the table.

4. **Select map**

   * Choose one of the available maps:

     * **Map 1**
     * **Map 2**
     * **Map 3**

5. **Predict ball ID**

   * Type a ball ID in the *“Dự đoán bóng ID”* (Predict Ball ID) field, then click **“Dự đoán”** (Predict).

6. **Watch the simulation**

   * Balls move around, collide, and bounce realistically inside the table area.

---

## ⚙️ Project Structure

| File                | Description                                                                                             |
| ------------------- | ------------------------------------------------------------------------------------------------------- |
| **Main.java**       | The main entry point. Initializes the main window and GUI components.                                   |
| **Ball.java**       | Defines the `Ball` class with properties (position, velocity, radius, color, ID) and movement behavior. |
| **BallPanel.java**  | Handles drawing, animation, and collision logic for balls and obstacles.                                |
| **Map.java**        | Represents a billiard table map, including boundaries and obstacles.                                    |
| **MapFactory.java** | Provides multiple map layouts (`Map1`, `Map2`, `Map3`).                                                 |
| **Obstacle.java**   | Defines obstacles (walls or barriers) used within maps.                                                 |

---

## 🧠 Technical Details

* **Language:** Java
* **Framework:** Java Swing (for GUI)
* **IDE:** Apache NetBeans 20

### Ball Physics

Each ball (`Ball.java`) contains:

* Position `(x, y)`
* Velocity `(vx, vy)` initialized randomly
* Movement logic that updates position per frame
* Boundary collision that reverses velocity when hitting walls

### Rendering

* All rendering is done via `Graphics2D` in `BallPanel.java`
* The animation loop repaints continuously to simulate real-time motion

---

## 🚀 How to Run (on NetBeans)

1. Open **Apache NetBeans**.
2. Go to **File → Open Project...** and select the project folder.
3. Wait for NetBeans to load dependencies.
4. In the *Projects* panel, right-click the project name → **Run** (or press `Shift + F6`).
5. The billiard simulation window will appear — enjoy playing!
---

## 👨‍💻 Author Hoàng Anh Nhật 
      DEMO VIDEO PLAY GAME 
      ----> https://youtu.be/bOaHdCfYs74




