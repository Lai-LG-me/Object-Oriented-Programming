| **Purpose**           | **Method**     | **Description**                       |
|------------------------|----------------|---------------------------------------|
| Access private field   | `get`          | To read data.        |
| Modify private field   | `set`          | To update or change the data.    |


### UML Relationships

| **Type**      | **Purpose**                          | **UML**        | **Example**                                   | **UML Symbol**      |
|--------------|------------------------------------|---------------|---------------------------------------------|------------------|
| Aggregation  | One-to-many relationship         | `Normal diamond`  | An address can belong to many students  | Student --◇ Address |
| Composition  | One-to-one strong relationship    | `Bold diamond`  | A name can only be part of a student   | Name --♦ Student  |
| Association  | General relationship between 2 classes (show怎样连接only）| `Solid line`  | A student enrolls in a course              | Student -- Course |
