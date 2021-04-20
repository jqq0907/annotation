##元注解
- `@Target(value = {ElementType.TYPE,ElementType.METHOD})`:限制自定义注解应用范围
```java
public enum ElementType {

      /** 类，接口（包括注解类型）或枚举的声明 */
     TYPE,
     
      /** 属性的声明 */
      FIELD,
 
      /** 方法的声明 */
      METHOD,
  
      /** 方法形式参数声明 */
      PARAMETER,
  
      /** 构造方法的声明 */
      CONSTRUCTOR,
  
      /** 局部变量声明 */
      LOCAL_VARIABLE,
  
      /** 注解类型声明 */
      ANNOTATION_TYPE,
  
      /** 包的声明 */
      PACKAGE
  }
```
- `@Retention(RetentionPolicy.RUNTIME)`:注解生命周期
```java
public enum RetentionPolicy {
    /**
     * （注解将被编译器忽略掉）
     */
    SOURCE,

    /**
     * （注解将被编译器记录在class文件中，但在运行时不会被虚拟机保留，这是一个默认的行为）
     */
    CLASS,

    /**
     * （注解将被编译器记录在class文件中，而且在运行时会被虚拟机保留，因此它们能通过反射被读取到）
     */
    RUNTIME
}
```
-  `@Documented`:自定义注解是否能随着被定义的java文件生成到JavaDoc文档当中
-  `@Inherited`:自定义注解如果写在了父类的声明部分，那么子类的声明部分也能自动拥有该注解