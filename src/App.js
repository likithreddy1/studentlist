import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import './App.css';
import Listpage from './list/Listpage.js';
import Createpage from './list/createstudent/createpage.js';
function App() {
  const students = [
    { id: 1, name: 'Alice Johnson', age: 20, class: '7' , number:"9003320102"},
    { id: 2, name: 'Bob Smith', age: 22, class: '10', number:"9003320102" },
    { id: 3, name: 'Charlie Brown', age: 21, class: '11', number:"9003320102" },
    { id: 4, name: 'Diana Green', age: 23, class: '12' , number:"9003320102"},
  ];

  return (
    <div className="App">
      <Router>
      <Routes>
        <Route path="/" element={<Listpage students={students}/>} />
        <Route path="/addstudent" element={<Createpage />} />
      </Routes>
    </Router>
    </div>
  );
}

export default App;
