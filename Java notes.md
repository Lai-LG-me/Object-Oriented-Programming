### Getter and Setter Methods

| **Purpose**           | **Method**     | **Description**                       |
|------------------------|----------------|---------------------------------------|
| Access private field   | `get`          | To read data.        |
| Modify private field   | `set`          | To update or change the data.    |

### UML Relationships

| **Type**      | **Purpose**                          | **UML**        | **Example**                                   | **UML Symbol** | **Code** |
|--------------|------------------------------------|---------------|---------------------------------------------|------------------|------------|
| Aggregation  | One-to-many relationship         | `Normal diamond`  | An address can belong to many students  | Student --◇ Address | `public class Student { private Name name; private Address address; }` |
| Composition  | One-to-one strong relationship    | `Bold diamond`  | A name can only be part of a student   | Name --♦ Student  | `// Composition Example Code` |
| Association  | General relationship between 2 classes | `Solid line`  | A student enrolls in a course              | Student -- Course | `// Association Example Code` |

#### In UML, if the variable got underline = static
