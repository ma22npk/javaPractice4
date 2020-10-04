class Main {
  // Personクラスを定義して、インスタンスを生成してみます。
  // インスタンスメソッドは、インスタンスのメソッドです。クラスに定義しても、実際は各インスタンスに属するというイメージを持っておきましょう。
  // それゆえ、インスタンスメソッドはインスタンス（を代入した変数）に対して呼び出します。
  public static void main(String[] args) {
    // Personクラスのインスタンスを生成し、変数person1に代入してください
    Person person1 = new Person();
    person1.name = "Kate Jones";
    System.out.println(person1.name);
    person1.hello();
    // Personクラスのインスタンスを生成し、変数person2に代入してください
    Person person2 = new Person();
    person2.name = "John Christopher Smith";
    System.out.println(person2.name);
    person2.hello();
  }
}
