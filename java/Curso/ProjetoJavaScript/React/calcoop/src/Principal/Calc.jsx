import React, {Component, Fragment} from 'react'
import './Calc.css'
// import Teclado from '../Components/Teclado'
// import Display from '../Components/Display'
import Header from '../Components/Header'



export default class Calc extends Component {
    render() {
        return(
            <Fragment>
                <div className="calc">
                    <div className="header">
                        <Header />
                    </div>
                </div>
            </Fragment>

        )
    }
}



