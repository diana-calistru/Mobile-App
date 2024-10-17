# Mobile-App
Repository for the Mobile Applications Course

# Custom Crochet Patterns

### Description:

Our crochet pattern management app helps users easily organize and access their collection of crochet designs. With the app, users can browse patterns by categories like sweaters, skirts, or bags, and each category is further divided into sections such as body, sleeves, or collar, when talking about the sweater. You can add new patterns, update existing ones, or simply view them whenever you need. It's designed to make your crochet projects more organized and enjoyable, all in one place!

---

### Domain details:

There will be a predefined collection of patterns stored on the server and the patterns that the user uploads will be stored locally.

### 1. **Pattern**

- **id** (integer): A unique identifier for each crochet pattern.
- **name** (string): The name or title of the crochet pattern (e.g. “Cozy Sweater”).
- **subcategory** (string): The subcategory the pattern belongs to, such as "Sleeve" "Collar", "Body" etc.
- **difficulty_level** (string): Describes how difficult the pattern is (e.g. Beginner, Intermediate, Advanced).
- image_url (string): The URL for the image that shows what the finished product looks like.
- instructions_url (string): The URL for the pdf file that consists of the actual instructions for the pattern.

### 2. **Category**

- **id** (integer): A unique identifier for each category.
- **name** (string): The name of the category (e.g. Sweater, Skirt, Bag).
- **description** (string): A brief description of what types of crochet patterns belong in the category.
- image_url (string): The URL for the image that shows the category. (e.g. an image of a shirt)

### 3. **Subcategory**

- **id** (integer): A unique identifier for each subcategory.
- **name** (string): The name of the subcategory (e.g., Body, Sleeves, Collar for a sweater).
- image_url (string): The URL for the image that shows the subcategory. (e.g. an image of a sleeve).

### 4. Category_**Subcategory**

**(will be needed since one subcategory could be associated with multiple categories e.g. the same sleeves could be used for a shirt or a dress)**

- category_id (integer): Links to the parent category.
- subcategory_id (integer): Links to the subcategory.

---

### CRUD operations:

The categories/subcategories are predefined and already in the database and the user should not change them in any way.

The user submitted patterns are the only thing the user can alter.

### 1. Create - add a new crochet pattern to the database

- a user submits a form with the necessary details for a new pattern (name, subcategory, difficulty_level, image_url and instructions_url)
- the app stores this information in the Pattern table and assigns it a unique id
- a success message should be shown to the user after this is completed

### 2. Read - retrieve and view crochet patterns and their info from the database

- the user can view the patterns based on the category they select and the details of one specific pattern once they open it
- the system returns a list of patterns or the relevant fields of a specific pattern

### 3. Update - modify the details of an existing pattern

- the user can choose to edit one of the patterns that they uploaded (e.g. changing the name, category, image, or adding a new pdf with instructions)
- the system updates the specified fields with the new information
- a success message should be shown to the user after this is completed

### 4. Delete - remove a crochet pattern from the database

- the user can choose to delete one of the patterns that they uploaded
- a success message should be shown to the user after this is completed

---

### Persistence details:

As I specified earlier, only the user submitted patterns can be altered and the changes (create, update, delete)  saved on the local database.

---

### Offline behavior:

- Since the changes that come from create, update or delete will be stored only on the local database, the device being offline should not interfere with the user experience.
- For the read operation, the predefined patterns should already be stored locally (cached from a previous online session) and the local ones are available at all times.

---

### App mockup:
