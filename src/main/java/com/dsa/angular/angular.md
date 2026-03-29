Here’s a **complete Angular interview preparation guide (Basic → Advanced)** tailored for a **4–5 years experienced developer** like you 👇

---

# 🔰 1. BASIC ANGULAR INTERVIEW QUESTIONS

### ✅ 1. What is Angular?

* Angular is a **TypeScript-based front-end framework** developed by Google
* Used for building **Single Page Applications (SPA)**

---

### ✅ 2. What is TypeScript?

* Superset of JavaScript
* Adds:

    * Static typing
    * Interfaces
    * Classes
* Angular is built using TypeScript

---

### ✅ 3. What are Components?

* Building blocks of Angular
* Contains:

    * HTML (Template)
    * CSS (Style)
    * TS (Logic)

---

### ✅ 4. What is Module (NgModule)?

* Organizes application into blocks
* Example:

    * `AppModule`
    * Feature modules

---

### ✅ 5. What is Data Binding?

Types:

* Interpolation → `{{data}}`
* Property Binding → `[value]`
* Event Binding → `(click)`
* Two-way → `[(ngModel)]`

---

### ✅ 6. What are Directives?

* Modify DOM behavior

Types:

* Structural → `*ngIf`, `*ngFor`
* Attribute → `ngClass`, `ngStyle`

---

### ✅ 7. What is Dependency Injection?

* Angular injects services into components
* Promotes loose coupling

---

### ✅ 8. What is Service?

* Used for:

    * API calls
    * Business logic
    * Shared data

---

# ⚙️ 2. INTERMEDIATE QUESTIONS

---

### ✅ 9. What is Routing in Angular?

* Navigation between pages
* Configured using:

```ts
RouterModule.forRoot(routes)
```

---

### ✅ 10. Lazy Loading?

* Load modules only when needed
* Improves performance

---

### ✅ 11. What is Lifecycle Hook?

Common hooks:

* `ngOnInit()`
* `ngOnChanges()`
* `ngOnDestroy()`

---

### ✅ 12. What is RxJS?

* Reactive programming library

Used for:

* Async operations
* API handling

Key concepts:

* Observable
* Observer
* Subscription

---

### ✅ 13. What is HttpClient?

* Used for API calls

```ts
this.http.get()
```

---

### ✅ 14. What is Pipe?

* Transform data in UI

Examples:

* `date`
* `uppercase`
* `currency`

---

### ✅ 15. What is Form Handling?

Two types:

* Template-driven
* Reactive forms (preferred in real apps)

---

# 🚀 3. ADVANCED ANGULAR QUESTIONS

---

### ✅ 16. Change Detection Strategy?

Types:

* Default
* OnPush (performance optimization)

---

### ✅ 17. What is Zone.js?

* Tracks async operations
* Triggers change detection automatically

---

### ✅ 18. What is Ahead-of-Time (AOT) Compilation?

* Compiles code at build time
* Improves performance

---

### ✅ 19. What is Ahead vs Just-in-Time (JIT)?

| Feature      | AOT        | JIT     |
| ------------ | ---------- | ------- |
| Compile Time | Build time | Runtime |
| Performance  | Faster     | Slower  |

---

### ✅ 20. What is TrackBy in ngFor?

* Improves performance

```html
*ngFor="let item of list; trackBy: trackByFn"
```

---

### ✅ 21. What is Angular CLI?

* Command line tool

Commands:

```bash
ng new app
ng generate component
ng serve
```

---

### ✅ 22. What is Interceptor?

* Intercepts HTTP requests

Used for:

* Auth token
* Logging
* Error handling

---

### ✅ 23. What is State Management?

Options:

* Service-based state
* NgRx (Redux pattern)

---

### ✅ 24. What is Renderer2?

* Safely manipulate DOM

---

### ✅ 25. What is ViewEncapsulation?

Types:

* Emulated (default)
* None
* ShadowDom

---

# 🧠 4. SCENARIO-BASED QUESTIONS (VERY IMPORTANT)

---

### 🔹 Q1: How to optimize Angular performance?

Answer:

* Lazy loading
* OnPush change detection
* TrackBy
* Avoid unnecessary API calls
* Use pure pipes

---

### 🔹 Q2: How do you handle API errors globally?

Answer:

* Use HTTP Interceptor

---

### 🔹 Q3: How to share data between components?

Answer:

* Parent → Child: @Input
* Child → Parent: @Output
* Unrelated: Service

---

### 🔹 Q4: How do you secure Angular app?

Answer:

* JWT authentication
* Route guards
* HTTPS
* Input validation

---

### 🔹 Q5: Difference between Subject & BehaviorSubject?

| Feature         | Subject | BehaviorSubject |
| --------------- | ------- | --------------- |
| Initial value   | ❌       | ✅               |
| Last value emit | ❌       | ✅               |

---

# 🔥 5. REAL INTERVIEW QUESTIONS (FOR YOUR EXPERIENCE)

Since you have **4.8 years experience**, expect:

### ⭐ Project-based Questions

* Explain your Angular architecture
* How did you handle API integration?
* How did you optimize performance?
* How did you manage state?

---

### ⭐ Coding Questions

* Create dynamic form
* Implement search filter
* Debounce API calls using RxJS

---

### ⭐ Debugging Questions

* Why change detection not working?
* Why API called multiple times?
* Memory leak in Angular?

---

# 🎯 BONUS: QUICK REVISION CHEAT SHEET

* Component = UI
* Service = Logic
* Module = Group
* RxJS = Async
* Interceptor = API middleware
* Guard = Route security

---

# 💡 If you want next:

I can give you:

✅ Angular **coding questions with solutions**
✅ Angular **real project architecture (Spring Boot + Angular)**
✅ Angular **MCQ test (interview simulation)**
✅ Angular **debugging scenarios (very important for Pay10 work)**

Just tell me 👍
