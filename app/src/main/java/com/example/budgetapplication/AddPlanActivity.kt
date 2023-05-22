class AddPlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_plan)

        val nextButton = findViewById<Button>(R.id.next_button)
        val totalBudgetInput = findViewById<EditText>(R.id.total_budget_input)

        nextButton.setOnClickListener {
            val totalBudget = totalBudgetInput.text.toString().toDoubleOrNull()

            if (totalBudget == null || totalBudget <= 0) {
                Toast.makeText(this, "Please enter a valid budget amount", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, PieChartActivity::class.java)
                intent.putExtra("total_budget", totalBudget)
                startActivity(intent)
            }
        }
    }
}