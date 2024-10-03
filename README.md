
<body>
    <h1>SuperHero FightEvil Simulator</h1>
    <p>
        Welcome to the <strong>SuperHero FightEvil Simulator</strong>! This Java-based application is a great example of reusable software components. It is designed to demonstrate how object-oriented programming principles can be used to build software that is modular, maintainable, and easy to extend for future use cases.
    </p>

  <h2>Key Principles: Software Reuse</h2>
    <p>
        This project is designed with an emphasis on <strong>software reuse</strong>. The core classes like <code>SuperHero</code> are modular and reusable across various scenarios. The project employs several techniques that allow developers to reuse code with minimal modification:
    </p>
    <ul>
        <li><strong>Encapsulation:</strong> The <code>SuperHero</code> class is self-contained, managing its own state and behavior, making it easy to reuse in different contexts.</li>
        <li><strong>Inheritance:</strong> The design allows the <code>SuperHero</code> class to be extended. For example, additional superhero types (like <code>Villain</code> or <code>AlienSuperHero</code>) can be created by extending the base class.</li>
        <li><strong>Modular Design:</strong> Each component of the project (e.g., hero creation, fight simulation, random event generation) is separated into modules, making it easy to swap, extend, or reuse individual parts of the system in new projects.</li>
        <li><strong>Scalability:</strong> The system can easily handle additional features such as new types of events or abilities without significant refactoring.</li>
    </ul>

   <h2>Features</h2>
    <ul>
        <li>Interactive SuperHero creation through user input (name and gender).</li>
        <li>Randomly generated strength levels that can be reused for other character types.</li>
        <li>Simulated daily events where the SuperHero either fights evil or receives praise, all while adhering to a modular structure for reuse.</li>
    </ul>

   <h2>How to Run the Project</h2>
    <ol>
        <li>Clone this repository: <code>git clone https://github.com/yourusername/SuperHero-FightEvil-Simulator.git</code></li>
        <li>Open the project in your preferred IDE (e.g., IntelliJ, Eclipse, NetBeans).</li>
        <li>Run the <strong>FightEvil.java</strong> file from the main method.</li>
    </ol>
    <h2>Project Structure</h2>
    <ul>
        <li><code>oop.ct1.superhero.SuperHero</code> - A reusable class designed to manage superhero properties like name, gender, and strength. This class is easily extendable and encapsulates all superhero behaviors.</li>
        <li><code>oop.ct1.fightevil.FightEvil</code> - The main class that manages the simulation of fighting evil and receiving praise, utilizing the reusable <code>SuperHero</code> class.</li>
    </ul>

   <h2>License</h2>
    <p>This project is licensed under the MIT License - see the <a href="LICENSE">LICENSE</a> file for details.</p>

   <h2>Author</h2>
    <p>
        Created by Samukelo for educational purposes, demonstrating software reuse principles in object-oriented programming. Contributions are welcome!
    </p>
</body>
</html>
