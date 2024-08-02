import matplotlib.pyplot as plt

flights = [
    [(1, 1), (2, 2), (3, 3)],  
    [(1, 1), (2, 4), (3.5, 3),],  
    [(1, 1), (4, 2), (3, 5),]   
]

def plot_flights(flights):
    colors = ['y', 'b', 'r'] 
    markers = ['o', 's', '^'] 
    
    plt.figure()
    
    for i, flight in enumerate(flights):
        x = [point[0] for point in flight]
        y = [point[1] for point in flight]
        plt.plot(x, y, color=colors[i % len(colors)], marker=markers[i % len(markers)], label=f'Flight {i+1}')
        plt.scatter(x, y, color=colors[i % len(colors)], marker=markers[i % len(markers)])
    
    plt.legend()
    plt.xlabel('X Coordinate')
    plt.ylabel('Y Coordinate')
    plt.title('Flight Paths')
    plt.grid(True)
    plt.show()

plot_flights(flights)
