### 以下程序的输出结果是
要加上注释说明程序运行结果的原因。题目先自己想答案，然后运行代码查看结果和自己想的是否一致，然后记录注释
#### 例. 
```
class A 
{ 
	public A(String s) 
	{ 
		System.out.print("A"); 
	} 
} 

public class B extends A 
{ 
    // 编译报错，因为类A中没有无参构造方法，子类构造方法中没有显式调用父类的构造方法
	public B(String s) 
	{ 
		System.out.print("B"); 
	} 
	public static void main(String[] args) 
	{ 
		new B("C"); 
		System.out.println(" "); 
	} 
} 
```


#### 31.
```
class A
{
    {
        System.out.println(1);
    }
}
 
class B extends A
{
    {
        System.out.println(2);
    }
}
 
class C extends B
{
    {
        System.out.println(3);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}
```

#### 2.
```
class A
{
    public A()
    {
        System.out.println("Class A Constructor");
    }
}
 
class B extends A
{
    public B()
    {
        System.out.println("Class B Constructor");
    }
}
 
class C extends B
{
    public C()
    {
        System.out.println("Class C Constructor");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}
```

#### 3.
```
class X
{
    public X(int i)
    {
        System.out.println(1);
    }
}
 
class Y extends X
{
    public Y()
    {
        System.out.println(2);
    }
}
```
#### 4. 
```
public class A
{
    public A()
    {
        System.out.println(1);
 
        super();
 
        System.out.println(2);
    }
}
```
#### 5. 
```
public class A
{
    public A(int i)
    {
 
    }
}
 
class B extends A
{
 
}
```
#### 6. 
```
public class A
{
    public A()
    {
        super();
 
        this(10);
    }
 
    public A(int i)
    {
        System.out.println(i);
    }
}
```

#### 7. 

```
class M
{
    int i;
 
    public M(int i)
    {
        this.i = i--;
    }
}
 
class N extends M
{
    public N(int i)
    {
        super(++i);
 
        System.out.println(i);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
    }
}
```
#### 8. 
```
class M
{
    int i = 51;
 
    public M(int j)
    {
        System.out.println(i);
 
        this.i = j * 10;
    }
}
 
class N extends M
{
    public N(int j)
    {
        super(j);
 
        System.out.println(i);
 
        this.i = j * 20;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
 
        System.out.println(n.i);
    }
}
```
#### 9. 
```
class X
{
    private int m = 48;
}
 
class Y extends X
{
    void methodOfY()
    {
        System.out.println(m);
    }
}
```
#### 10. 
```
class X
{
    int m = 1111;
 
    {
        m = m++;
 
        System.out.println(m);
    }
}
 
class Y extends X
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
        return m-- + --m;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}
```

#### 11. 
```
class A
{
	void A()
	{
		System.out.println(1);
	}
}

class B extends A
{
	void B()
	{
		A();
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		new B().B();
	}
}
```
#### 12. 
```
class A
{
	int i = 1212;
}

class B extends A
{
	A a;

	public B(A a)
	{
		this.a = a;
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		A a = new A();

		B b = new B(a);

		System.out.println(a.i);

		System.out.println(b.i);

		System.out.println(b.a.i);

		b.a.i = 2121;

		System.out.println("--------");

		System.out.println(a.i);

		System.out.println(b.i);
	}
}
```

#### 13. 

```
class A
{
	int methodOfA(int i)
	{
		i /= 10;

		return i;
	}
}

class B extends A
{
	int methodOfB(int i)
	{
		i *= 20;

		return methodOfA(i);
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		B b = new B();

		System.out.println(b.methodOfB(100));
	}
}
```

#### 14. 
```
class One
{
	int x = 2121;
}

class Two
{
	int x = 1212;
	
	{
		System.out.println(x);
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		Two two = new Two();
	}
}
```


## 第二次练习

#### 1.
```
class Clidder  
{ 
    private final void flipper()  
    { 
        System.out.println("Clidder"); 
    } 
} 
  
public class Clidlet extends Clidder  
{ 
    public final void flipper()  
    { 
        System.out.println("Clidlet"); 
    } 
    public static void main(String[] args)  
    { 
        new Clidlet().flipper(); 
    } 
} 
```
#### 2.

```
class Alpha  
{ 
    static String s = " "; 
    protected Alpha()  
    { 
        s += "alpha "; 
    } 
} 
class SubAlpha extends Alpha  
{ 
    private SubAlpha()  
    { 
        s += "sub "; 
    } 
} 
  
public class SubSubAlpha extends Alpha  
{ 
    private SubSubAlpha()  
    { 
        s += "subsub "; 
    } 
    public static void main(String[] args)  
    { 
        new SubSubAlpha(); 
        System.out.println(s); 
    } 
} 
```
#### 3.
```
class Grandparent  
{ 
    public void Print()  
    { 
        System.out.println("Grandparent's Print()");  
    }  
} 
  
class Parent extends Grandparent  
{ 
    public void Print()  
    { 
        System.out.println("Parent's Print()");  
    }  
} 
  
class Child extends Parent  
{ 
    public void Print()    
    { 
        super.super.Print(); 
        System.out.println("Child's Print()");  
    }  
} 
  
public class Main  
{ 
    public static void main(String[] args)  
    { 
        Child c = new Child(); 
        c.Print();  
    } 
} 
```
