| **Purpose**           | **Method**     | **Description**                       |
|------------------------|----------------|---------------------------------------|
| Access private field   | `get`          | To read data.        |
| Modify private field   | `set`          | To update or change the data.    |


### UML diagram
|**Type**   | **Purpose**               | **UML**         | **Example**                         |  **UML Symbol**  |
|-----------|---------------------------|-----------------|---------------------------------------|------------------|
|Aggregation| One-to-many relationship  | `Normal diamond`| An address can belongs to many student.|Name --◇ Address |
|Composition| One-to-one realtionship   | `Bold diamond`  | A name can only be part of student    |Name --♦ Student  |
