### Private, public  and protected

| **Type**           | **UML**     | **Description**                       |
|------------------------|----------------|---------------------------------------|
| private   | `-`          |   Need permssion, only same class can use (subclass & other class cannot use)     |
| public   | `+`          |    Everyone can access |
| protected | `#`         |  Subclass can use, other class cannot use |

### Parameterized vs No-argument constructor
| **Constructor** | **Purpose** | **Example** |
|------------------------|----------------|---------------------------------------|
|Parameterized Constructor | Immediately create object with values | new Student("S001", "Alice", 2, 3.5);|
|No-Argument Constructor | Create object without values (default first) | new Student();|


### Getter and Setter Methods

| **Purpose**           | **Method**     | **Description**                       |
|------------------------|----------------|---------------------------------------|
| Access private field   | `get`          | To read data (access data).        |
| Modify private field   | `set`          | To update or change the data.    |

### ToString Methods
`public String toString(){`

    	`return String.format("Name: %s", "Year Joined: %d", "Basic Salary: %.2f " );`
     
   ` }`
| **Variable Type**  | **Method**  | **Description**            |
|-------------------|------------|---------------------------|
| String           | `%s`        |                           |
| int              | `%d`        |                           |
| double           | `%.2f`      | for 2 decimal places      |
| char            | `%c`        |                           |
| boolean         | `%b`        | boolean true or false     |


### UML Relationships

| **Type**      | **Purpose**                          | **UML**        | **Example**                                   | **UML Symbol** | **Code** |
|--------------|------------------------------------|---------------|---------------------------------------------|------------------|------------|
| Aggregation  | One-to-many relationship         | `Normal diamond`  | An address can belong to many students  | Student --◇ Address | `public class Student { private Name name; private Address address; }` |
| Composition  | One-to-one strong relationship    | `Bold diamond`  | A name can only be part of a student   | Name --♦ Student  | `// Composition Example Code` |
| Association  | General relationship between 2 classes | `Solid line`  | A student enrolls in a course              | Student -- Course | `// Association Example Code` |

#### In UML, if the variable got underline = static
