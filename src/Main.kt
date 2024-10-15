fun main() {
    val student: Student? = Student()

    student?.let{it ->
        it.hi()
        it.bye()
        it.name="123"
    }
    //apply
    val nameStudent = student?.apply{this:Student
        hi()
        bye()
        name ="123512"
    }
    //run
    val stringStudent = Student()?.run {this:Student
        bye()
        hi()
        lastname^run
    }
    println(stringStudent)
    //with
    val nameStudent = with(Student()) {this:Student
        hi()
        bye()

        name^with
    }
    //also
    val studentCringe = Student()?.also {st ->
        st.hi()
        st.bye()
        st.name = "Hello"
        Math.PI
    }
}
